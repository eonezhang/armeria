/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.armeria.common.reactivestreams;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

final class AbortingSubscriber implements Subscriber<Object> {

    static final AbortingSubscriber INSTANCE = new AbortingSubscriber();

    private AbortingSubscriber() {}

    @Override
    public void onSubscribe(Subscription s) {
        s.cancel();
    }

    @Override
    public void onNext(Object o) {}

    @Override
    public void onError(Throwable t) {}

    @Override
    public void onComplete() {}
}
