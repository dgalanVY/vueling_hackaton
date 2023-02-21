package com.dgalan.vueling_hackaton.logistic.domain.di

import com.dgalan.vueling_hackaton.logistic.domain.LogisticDomainLayerContract
import com.dgalan.vueling_hackaton.logistic.domain.model.LogisticResult
import com.dgalan.vueling_hackaton.logistic.domain.usecase.GetLogisticUC
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class CharactersDomainModule() {

    @Provides
    @Named("get_all_characters")
    fun provideGetAllCharactersUc(getAllCharactersUc: GetLogisticUC): @JvmSuppressWildcards LogisticDomainLayerContract.PresentationLayer.UseCase<LogisticResult> =
        getAllCharactersUc
}