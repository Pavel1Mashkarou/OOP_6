public class Program {
    public static void main(String[] args) {
        InputService inServ = new InputService();
        JsonService jsonService = new JsonService();
        Order order = inServ.inputFromConsole();
        jsonService.saveToJson(order);
    }
}
