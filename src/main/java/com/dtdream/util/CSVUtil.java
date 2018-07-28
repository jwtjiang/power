package com.dtdream.util;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * csv工具
 */
public class CSVUtil {
    /** <Description functions in a word>
     * Bytes to Hex String
     * 将字节数组转换成16进制字符串
     * <Detail description>
     * @author  lcl
     * @param src
     * @return [Parameters description]
     * @return String [Return type description]
     * @exception throws [Exception] [Exception description]
     * @see [Related classes#Related methods#Related properties]
     */
    public static String bytes2HexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        System.out.println(" bytes2HexString = "+stringBuilder.toString().toUpperCase());
        return stringBuilder.toString().toUpperCase();
    }

    /** <Description functions in a word>
     * Judge this FileInputStream is csv file
     * 判断该文件流头部是否包含有指定的信息，从而确认该文件是不是正确的文件类型
     * <Detail description>
     * @author  lcl
     * @param is
     * @return [Parameters description]
     * @return boolean [Return type description]
     * @exception throws [Exception] [Exception description]
     * @see [Related classes#Related methods#Related properties]
     */
    public static boolean judgeIsCSV(InputStream is){
        try {
            byte[] b = new byte[4];
            is.read(b, 0, b.length);
            //CSV文件的头部的前4个字节
            return bytes2HexString(b).contains("5B75726C");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void readCSV() {
        try {
            // 用来保存数据
            ArrayList<String[]> csvFileList = new ArrayList<String[]>();
            // 定义一个CSV路径
            String csvFilePath = "D://DTDream//model_input.csv";
            // 创建CSV读对象 例如:CsvReader(文件路径，分隔符，编码格式);
            CsvReader reader = new CsvReader(csvFilePath, ',', Charset.forName("gb2312"));
            // 跳过表头 如果需要表头的话，这句可以忽略
            reader.readHeaders();
            // 逐行读入除表头的数据
            while (reader.readRecord()) {
                System.out.println(reader.getRawRecord());
                csvFileList.add(reader.getValues());
            }
            reader.close();
            // 遍历读取的CSV文件
//            for (int row = 0; row < csvFileList.size(); row++) {
//                // 取得第row行第0列的数据
//                String cell = csvFileList.get(row)[0];
//                System.out.println("------------>"+cell);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeCSV() {
        // 定义一个CSV路径
        String csvFilePath = "D://StemQ.csv";
        try {
            // 创建CSV写对象 例如:CsvWriter(文件路径，分隔符，编码格式);
            CsvWriter csvWriter = new CsvWriter(csvFilePath, ',', Charset.forName("gb2312"));
            // 写表头
            String[] csvHeaders = { "线路ID", "线路名称", "杆塔名称","区县","杆塔ID","YEAR","MONTH","REGION","TERRAIN","WHDJ" };
            csvWriter.writeRecord(csvHeaders);
            // 写内容
            for (int i = 0; i < 20; i++) {
                String[] csvContent = { i + "000000", "StemQ", "1" + i };
                csvWriter.writeRecord(csvContent);
            }
            csvWriter.close();
            System.out.println("--------CSV文件已经写入--------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CSVUtil csvUtil = new CSVUtil();
        csvUtil.readCSV();
       // csvUtil.writeCSV();
    }
}
