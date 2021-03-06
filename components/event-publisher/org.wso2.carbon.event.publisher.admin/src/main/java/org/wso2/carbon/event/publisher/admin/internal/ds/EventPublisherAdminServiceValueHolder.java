/*
 * Copyright (c) 2005 - 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.wso2.carbon.event.publisher.admin.internal.ds;

import org.wso2.carbon.event.output.adapter.core.OutputEventAdapterService;
import org.wso2.carbon.event.publisher.core.EventPublisherService;


public class EventPublisherAdminServiceValueHolder {

    private static OutputEventAdapterService outputEventAdapterService;
    private static EventPublisherService eventPublisherService;
    
    public static void registerEventAdapterService(
            OutputEventAdapterService eventAdapterService) {
        EventPublisherAdminServiceValueHolder.outputEventAdapterService = eventAdapterService;
    }

    public static OutputEventAdapterService getOutputEventAdapterService() {
        return EventPublisherAdminServiceValueHolder.outputEventAdapterService;
    }

    public static void registerEventPublisherService(
            EventPublisherService eventPublisherService) {
        EventPublisherAdminServiceValueHolder.eventPublisherService = eventPublisherService;
    }

    public static EventPublisherService getEventPublisherService() {
        return EventPublisherAdminServiceValueHolder.eventPublisherService;
    }
}
