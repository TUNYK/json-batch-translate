/*
 * Copyright (c) 2011 Mykola Tunyk <m at tunyk.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 */
package ru.yandex.translate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.yandex.translate.api.LanguageTest;
import ru.yandex.translate.api.YandexTranslateTest;

/**
 * @author Mykola Tunyk <m at tunyk.com>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({LanguageTest.class, YandexTranslateTest.class})
public class AllTests {
    //nothing
}
