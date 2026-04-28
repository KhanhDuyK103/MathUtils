package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static long getFactorial(int n) {
        logger.info("Đang tính giai thừa cho số: {}", n); // Dùng Logger thay vì println
        if (n < 0) {
            logger.error("Số nhập vào không hợp lệ: {}", n);
            throw new IllegalArgumentException("n phải >= 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}