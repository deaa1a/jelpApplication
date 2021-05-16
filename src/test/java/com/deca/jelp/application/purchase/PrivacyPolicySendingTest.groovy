package com.deca.jelp.application.purchase

import spock.lang.Specification

class PrivacyPolicySendingTest extends Specification{

    def 'It should send otp'(){
        given:
        def numberOne = 2
        def numberTwo = 3
        SendPrivacyPolicy sendOtp = new SendPrivacyPolicy()
        when:
        def result = sendOtp.sumar(numberOne,numberTwo)
        def expected = 5
        then:
        expected == result
    }

}
