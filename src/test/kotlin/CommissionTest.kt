import org.junit.Test
import org.junit.Assert.assertEquals
import  ru.netology.commissionCalc

class TestCommission {
    @Test
    fun maestroCommision() {
        val type = "Maestro"
        val prev = 0
        val ammount = 60000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(380, result)
    }

    @Test
    fun masterCommision() {
        val type = "Mastercard"
        val prev = 0
        val ammount = 60000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(380, result)
    }

    @Test
    fun visaCommision() {
        val type = "Visa"
        val prev = 0
        val ammount = 1000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(75, result)
    }
    @Test
    fun mirCommision() {
        val type = "Мир"
        val prev = 0
        val ammount = 1000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(75, result)
    }
    @Test
    fun VKCommision() {
        val type = "VKpay"
        val prev = 0
        val ammount = 2000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(0, result)
    }



}

