import org.junit.Test
import org.junit.Assert.assertEquals
//import  ru.netology.commissionCalc

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
    fun maestroCommisionLimitMount() {
        val type = "Maestro"
        val prev = 0
        val ammount = 6000000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-2, result)
    }
    @Test
    fun maestroCommisionLimitDay() {
        val type = "Maestro"
        val prev = 0
        val ammount = 200000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-2, result)
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
    fun visaCommisionLimitMount() {
        val type = "Visa"
        val prev = 0
        val ammount = 1000000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-2, result)
    }
    @Test
    fun visaCommisionLimitDay() {
        val type = "Visa"
        val prev = 0
        val ammount = 200000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-2, result)
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
    @Test
    fun VKCommisionLimitMount() {
        val type = "VKpay"
        val prev = 40000
        val ammount = 10000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-2, result)
    }
    @Test
    fun VKCommisionLimitDayt() {
        val type = "VKpay"
        val prev = 0
        val ammount = 20000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-2, result)
    }
    @Test
    fun errorCardType() {
        val type = "VK pay"
        val prev = 0
        val ammount = 1000
        val result = commissionCalc(cardType = type, previousPay = prev, amount = ammount)
        assertEquals(-1, result)
    }
}

