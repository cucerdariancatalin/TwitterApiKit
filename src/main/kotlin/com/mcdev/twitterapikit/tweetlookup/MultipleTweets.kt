package com.mcdev.twitterapikit.tweetlookup


import com.mcdev.twitterapikit.model.Errors
import com.mcdev.twitterapikit.`object`.Tweet


class MultipleTweets {
    var data: ArrayList<Tweet>? = null
    var errors: ArrayList<Errors>? = null
}