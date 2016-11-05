int lateRide(int n) {
    int hrInt = n/60;
    double hrDouble = n/60.0, secDouble = (hrDouble-hrInt)*60;
    int minInt = (int) secDouble;
    String time = hrInt + "" + minInt;
    n = 0;
    for (int i = 0; i < time.length(); i++)
        n += Integer.parseInt(""+time.charAt(i));
    return n;
}
