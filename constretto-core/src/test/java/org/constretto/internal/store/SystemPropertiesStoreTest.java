/*
 * Copyright 2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.constretto.internal.store;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.constretto.model.PropertySet;
import org.junit.Test;

/**
 * @author <a href="mailto:thor.aage.eldby@arktekk.no">Thor &Aring;ge Eldby</a>
 */
public class SystemPropertiesStoreTest {

    @Test
    public void load() {
        System.setProperty("somedb.username", "user0");
        SystemPropertiesStore store = new SystemPropertiesStore();
        List<PropertySet> set = store.load();
        assertNotNull(set);
        assertEquals(1, set.size());
        assertEquals("user0", set.get(0).getProperties().get("somedb.username"));
    }

}
