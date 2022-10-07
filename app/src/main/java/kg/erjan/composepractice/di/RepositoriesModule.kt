package kg.erjan.composepractice.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kg.erjan.composepractice.data.repositories.AnimeGirlsRepositoryImpl
import kg.erjan.composepractice.domain.repository.AnimeGirlsRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindAnimeGirlsRepositoryImpl(
        animeGirlsRepositoryImpl: AnimeGirlsRepositoryImpl
    ): AnimeGirlsRepository

}