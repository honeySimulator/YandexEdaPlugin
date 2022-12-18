package com.example.yandexedaplugin3
import com.intellij.ide.BrowserUtil.browse
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class OrderFoodAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        Messages.showMessageDialog("Заказать еду", "Яндекс Еда", Messages.getInformationIcon());
        browse("https://eda.yandex.ru/spb?shippingType=delivery")
    }
}