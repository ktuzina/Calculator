package com.company;

public class Calculator {

    private float value1;
    private float value2;

    public Calculator(float value1, float value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public float addition(){
        float result = 0;
        result = this.value1 + this.value2;
        return result;
    }

    public float subtraction(){
        float result = 0;
        result = this.value1 - this.value2;
        return result;
    }

    public float multiplication(){
        float result = 0;
        result = this.value1 * this.value2;
        return result;
    }

    public float division(){
        float result = 0;
        result = this.value1 / this.value2;
        return result;
    }
}
