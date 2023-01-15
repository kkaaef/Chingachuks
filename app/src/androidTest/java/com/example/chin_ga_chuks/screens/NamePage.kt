package com.example.chin_ga_chuks.screens
import com.example.chin_ga_chuks.MainPageActivity
import com.example.chin_ga_chuks.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton

object NamePage : KScreen<NamePage>(){
    override val layoutId: Int?
        get() = R.layout.main_page
    override val viewClass: Class<*>?
        get() = MainPageActivity::class.java


    val simpleButton = KButton { withId(R.id.name) }


}