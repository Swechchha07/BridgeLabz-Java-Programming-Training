public class ByteArrayOutputStream{
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        bos.write(65);
        bos.write(66);
        byte[] arr=bos.toByteArray();
        for(byte b:arr){
            System.out.println((char)b);
        }
    }
} 