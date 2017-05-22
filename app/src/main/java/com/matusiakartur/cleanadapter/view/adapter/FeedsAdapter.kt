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

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.matusiakartur.cleanadapter.model.Feed

class FeedsAdapter(private var data: List<Feed>): RecyclerView.Adapter<BaseViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return data[position].type?.value
    }

    override fun onBindViewHolder(holder: BaseViewHolder?, position: Int) {
        holder?.invalidateView(this.data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        return FeedViewHolderFactory.createViewHolder(viewType, parent!!)
    }
}