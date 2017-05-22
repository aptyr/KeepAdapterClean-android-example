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

import android.view.View
import android.widget.TextView
import com.matusiakartur.cleanadapter.R
import com.matusiakartur.cleanadapter.model.Feed

open class TextViewHolder(view: View): BaseViewHolder(view) {

    val textLabel = view.findViewById(R.id.feed_item_text) as TextView

    override fun invalidateView(feed: Feed) {

        this.textLabel.text = feed.text

    }

}