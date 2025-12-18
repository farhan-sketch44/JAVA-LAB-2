class Calculator {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    int subtract(int... nums) {      // var-args version
        if (nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result -= nums[i];
        }
        return result;
    }
}
