package com.matusiakartur.cleanadapter.view

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

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.matusiakartur.cleanadapter.R
import com.matusiakartur.cleanadapter.model.Feed
import com.matusiakartur.cleanadapter.model.Image
import com.matusiakartur.cleanadapter.view.adapter.FeedsAdapter

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    val data = listOf(
            Feed("This is sample text #1."),
            Feed(Image("https://pbs.twimg.com/profile_images/737359467742912512/t_pzvyZZ.jpg")),
            Feed("meeeow", Image("http://68.media.tumblr.com/1f883534e42eed7cbadc6b44d7ac5ba6/tumblr_mr0rfqYWT61rzkbeyo1_1280.jpg")),
            Feed(Image("https://pbs.twimg.com/profile_images/737359467742912512/t_pzvyZZ.jpg")),
            Feed("This is sample text #2."),
            Feed("This is sample text #3.")

            )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.recyclerView = findViewById(R.id.main_recycler_view) as RecyclerView
        this.recyclerView?.adapter = FeedsAdapter(data)
    }
}
