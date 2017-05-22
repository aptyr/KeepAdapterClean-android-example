package com.matusiakartur.cleanadapter.model

/**
 * Copyright (C) 2017 Artur Matusiak (github.com/aptyr)
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

class Feed {

    enum class Type {
        TEXT {
            override val value = 0
        },

        IMAGE {
            override val value = 1
        },

        TEXT_WITH_IMAGE {
            override val value = 2
        };

        abstract val value: Int

    }

    var type = Type.TEXT
        private set

    var text: String? = null
        private set

    var image: Image? = null
        private set

    constructor(text: String) {
        this.text = text
    }

    constructor(image: Image) {
        this.image = image
        this.type = Type.IMAGE
    }

    constructor(text: String, image: Image) {
        this.text = text
        this.image = image
        this.type = Type.TEXT_WITH_IMAGE


    }
}