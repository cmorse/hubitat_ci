package me.biocomp.hubitat_ci.api.app_api;

import me.biocomp.hubitat_ci.api.common_api.DeviceWrapper

interface Subscription {
    /**
     * Subscribe to event, or attribute value changes.
     *
     * @param toWhat                                 - could be Device, Location (or app_api)?
     * @param attributeNameOrNameAndValueOrEventName Could be:
     *                                               1. name of event,
     *                                               2. name of attribute that changed
     *                                               3. Format of 'attribute.value' to get notification only for specific value
     * @param handlerMethod                          - The method to call when the Event is fired.
     *                                               Can be a String of the method name or the method reference itself.
     * @param options
     */
    abstract void subscribe(Object toWhat, String attributeNameOrNameAndValueOrEventName, Object handlerMethod, Map options)

    abstract void subscribe(Object location, Object handlerMethod)

    abstract void subscribe(Object toWhat, String attributeNameOrNameAndValueOrEventName, Object handler)

    /**
     * Deletes all subscriptions for the installed App.
     * Typically should be called in the updated() method, since device preferences may have changed.
     */
    abstract void unsubscribe()

    /**
     * Deletes device subscription.
     * Typically should be called in the updated() method, since device preferences may have changed.
     */
    abstract void unsubscribe(DeviceWrapper device)

    /**
     * Deletes subscriptions for devices.
     * Typically should be called in the updated() method, since device preferences may have changed.
     */
    abstract void unsubscribe(List devices)
}
