package kg.erjan.composepractice.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kg.erjan.composepractice.data.remote.apiServices.AnimeGirlsApiService
import kg.erjan.composepractice.data.remote.apiServices.mock.AnimeGirlsApiServiceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideAnimeGirlsApiService(
        @ApplicationContext context: Context
    ): AnimeGirlsApiService {
        return AnimeGirlsApiServiceImpl(context)
    }
}