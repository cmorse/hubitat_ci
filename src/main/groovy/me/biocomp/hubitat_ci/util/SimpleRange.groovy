package me.biocomp.hubitat_ci.util
import groovy.transform.TupleConstructor

@TupleConstructor
class SimpleRange
{
    def begin
    def end

    boolean isValueWithin(def val)
    {
        if (begin != null && val < begin)
        {
            return false
        }

        if (end != null && val > end)
        {
            return false
        }

        return true
    }

    private static def parseOneNumber(String s)
    {
        if (s == '*')
        {
            return null
        }

        try
        {
            return s.toInteger()
        }
        catch (NumberFormatException)
        {
            return s.toDouble()
        }
    }

    /**
     * Supported range formats:
     * <code>
     *     "*..*",
     *     "2..7",
     *     "-5.3..8.9",
     *     "1..*"
     * </code>
     * @param range string
     * @return range object
     */
    static SimpleRange parse(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Range string can't be null")
        }

        def beginAndEnd = s.split(/\.\./)
        if (beginAndEnd.size() != 2)
        {
            throw new IllegalArgumentException("String '${s}' could not be split around '..'. Got following array: ${beginAndEnd}")
        }

        return new SimpleRange(
            begin: parseOneNumber(beginAndEnd[0]),
            end: parseOneNumber(beginAndEnd[1]))
    }
}
