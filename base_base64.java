public class Main {
    public static void main(String[] args) {
        
        // Encode 
        String base_data = "Hava a good day";
        byte[] data_bytes = base_data.getBytes();
        String encoded_data = Base64.getEncoder().encodeToString(data_bytes);

        // Decode
        byte[] decoded_bytes = Base64.getDecoder().decode(encoded_data);
        String decoded_data = new String(decoded_bytes);

        System.out.println("Original data: " + base_data); // Original data: Hava a good day
        System.out.println("Encoded data: " + encoded_data); // Encoded data: SGF2YSBhIGdvb2QgZGF5
        System.out.println("Decoded data: " + decoded_data); // Decoded data: Hava a good day

    }
}
