package com.example.workshop

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.techno.R

data class Movie(
    @DrawableRes val icon: Int,
    val tag: TagType,
    val title: String,
    val description: String,
    val rating: Float
)

enum class TagType(
    @StringRes val title: Int,
    @ColorRes val backgroundColorRes: Int
) {

    POPULAR(R.string.tag_popular, R.color.purple_700),
    NEW(R.string.tag_new, R.color.purple_500),
    FAMILY(R.string.tag_family, R.color.purple_200),
    CHILD(R.string.tag_child, R.color.teal_700),
    INTERESTING(R.string.tag_interesting, R.color.teal_200)
}