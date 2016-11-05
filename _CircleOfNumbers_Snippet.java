int circleOfNumbers(int n, int firstNumber) {
    if (n/2 > firstNumber)
        return n/2+firstNumber;
    else if (firstNumber > n/2)
        if (n/2+firstNumber > n)
            return (n/2+firstNumber)-n;
        else if (n/2+firstNumber >9)
            return (n/2+firstNumber)%10;
        else
            return n/2+firstNumber;
    else
        return 0;
}
