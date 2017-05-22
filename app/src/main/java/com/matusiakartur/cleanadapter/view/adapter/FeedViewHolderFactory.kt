package com.matusiakartur.cleanadapter.view.adapter

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

import android.view.LayoutInflater
import android.view.ViewGroup
import com.matusiakartur.cleanadapter.R
import com.matusiakartur.cleanadapter.model.Feed

class FeedViewHolderFactory {

    companion object {

        fun createViewHolder(viewType: Int, parent: ViewGroup): BaseViewHolder {
            when(viewType) {

                Feed.Type.TEXT.value -> {
                    return TextViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.feed_item_text, parent, false))
                }

                Feed.Type.TEXT_WITH_IMAGE.value -> {
                    return TextImageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.feed_item_text_image, parent, false))
                }

                else -> {
                    return ImageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.feed_item_image, parent, false))
                }

            }
        }

    }

}