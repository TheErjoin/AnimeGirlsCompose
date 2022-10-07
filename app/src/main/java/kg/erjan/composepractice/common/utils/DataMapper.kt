package kg.erjan.composepractice.common.utils

interface DataMapper<T> {
    fun mapToDomain(): T
}