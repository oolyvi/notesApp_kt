package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.util

//order type can be ascending and descending
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}