package com.example.yandexedaplugin3

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import javax.swing.ImageIcon

class SearchFoodAction : AnAction(){
    override fun actionPerformed(event: AnActionEvent) {
        val icon = ImageIcon("META-INF/pluginIcon.png")
        val string = Messages.showInputDialog("Введите какую еду хотите заказать: ", "Найти", icon)
        val url1 = "https://eda.yandex.ru/search?query="
        val url2 = "&type=all"
        BrowserUtil.browse(url1 + string + url2)
    }
}