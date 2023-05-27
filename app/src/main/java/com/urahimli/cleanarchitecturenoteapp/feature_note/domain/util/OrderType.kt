package com.urahimli.cleanarchitecturenoteapp.feature_note.domain.util

//ascending ve ya descending ola biler
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}