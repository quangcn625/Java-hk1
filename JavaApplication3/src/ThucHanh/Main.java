///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package ThucHanh;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class TransactionSearch {
//    private List<Transaction> transactions;
//
//    public TransactionSearch(List<Transaction> transactions) {
//        this.transactions = transactions;
//    }
//
//    public List<Transaction> searchTransactions(String transactionCode, String startDate, String endDate, double minAmount, double maxAmount) {
//        List<Transaction> result = new ArrayList<>();
//
//        for (Transaction transaction : transactions) {
//            boolean match = true;
//
//            // Kiểm tra theo mã giao dịch
//            if (transactionCode != null && !transaction.getTransactionCode().contains(transactionCode)) {
//                match = false;
//            }
//
//            // Kiểm tra theo ngày giao dịch trong khoảng
//            if (startDate != null && endDate != null) {
//                Date transactionDate = transaction.getDateAsDate();
//                Date start = parseDate(startDate);
//                Date end = parseDate(endDate);
//
//                if (transactionDate.before(start) || transactionDate.after(end)) {
//                    match = false;
//                }
//            }
//
//            // Kiểm tra theo số lượng giao dịch trong khoảng
//            double amount = transaction.getAmount();
//            if (amount < minAmount || amount > maxAmount) {
//                match = false;
//            }
//
//            if (match) {
//                result.add(transaction);
//            }
//        }
//
//        return result;
//    }
//
//    private Date parseDate(String dateString) {
//        // Phương thức này cần được triển khai để chuyển đổi chuỗi ngày thành đối tượng Date
//        // Ở đây, để đơn giản, chúng ta có thể giả định rằng dateString là định dạng hợp lệ.
//        // Trong thực tế, bạn nên sử dụng SimpleDateFormat hoặc thư viện khác để chuyển đổi chuỗi ngày.
//        // Trong trường hợp này, chúng ta sẽ giả sử dateString có định dạng "yyyy-MM-dd".
//        // Đây chỉ là một ví dụ đơn giản, không phải là cách tốt nhất trong mọi trường hợp.
//        return new Date();
//    }
//}
