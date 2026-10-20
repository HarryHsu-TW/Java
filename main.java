//public class main {
//    public static void main(String[] args) {
//        FizzBuzz fizzBuzz1 = new FizzBuzz(0, 20);
//        fizzBuzz1.fizzBuzz();
//        fizzBuzz1.fizzBuzzOne();
//
//    }
//}

//public class main {
//    public static void main(String[] args) {
//        // 1. 建立 DataSet 實例
//        DataSet dataset = new DataSet();
//
//        // 2. 測試空集合時的預設輸出
//        System.out.println("=== 測試 1：空集合狀況 ===");
//        System.out.println("初始平均值: " + dataset.getAverage()); // 應為 0.0
//        System.out.println("初始最小值: " + dataset.getSmallest()); // 應為 0.0
//        System.out.println("初始最大值: " + dataset.getLargest());  // 應為 0.0
//        System.out.println("初始全距: " + dataset.getRange());     // 應為 0.0
//        System.out.println();
//
//        // 3. 新增數值到 DataSet 中
//        System.out.println("=== 測試 2：新增資料 ===");
//        dataset.add(10.5);
//        dataset.add(4.2);
//        dataset.add(18.9);
//        dataset.add(2.5);
//        dataset.add(13.8);
//        System.out.println("已新增數值: [10.5, 4.2, 18.9, 2.5, 13.8]");
//        System.out.println();
//
//        // 4. 印出各項統計計算結果
//        System.out.println("=== 測試 3：計算結果 ===");
//        System.out.println("平均值 (Average) : " + dataset.getAverage());  // 期望值: 9.98
//        System.out.println("最小值 (Smallest): " + dataset.getSmallest()); // 期望值: 2.5
//        System.out.println("最大值 (Largest) : " + dataset.getLargest());  // 期望值: 18.9
//        System.out.println("全距   (Range)   : " + dataset.getRange());    // 期望值: 16.4 (18.9 - 2.5)
//    }
//}



public class main {
    public static void main(String[] args) {
        Calculator calculator_1 = new Calculator();
        System.out.println(calculator_1.add(8,9));
        System.out.println(calculator_1.subtract(8,9));
        System.out.println(calculator_1.multiply(8,9));
        System.out.println(calculator_1.divide(9,8));
        System.out.println(calculator_1.power(3,2));
        System.out.println(calculator_1.calculateSurfaceCircle(3.77));
        System.out.println(calculator_1.logicOr(false, false));
        System.out.println(calculator_1.logicAnd(true, true));
        System.out.println(calculator_1.logicNot(false));


        System.out.println(calculator_1.addInt(8,9));
        System.out.println(calculator_1.subtractInt(8,9));
        System.out.println(calculator_1.multiplyInt(8,9));
        System.out.println(calculator_1.divideInt(8,9));
        System.out.println(calculator_1.powerInt(3,2));



    }
}

