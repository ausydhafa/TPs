public class BurhanEkspress {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println(" _____                                                                                   _____ \r\n" + //
                        "( ___ )---------------------------------------------------------------------------------( ___ )\r\n" + //
                        " |   |                                                                                   |   | \r\n" + //
                        " |   |      ____             _                   _____                                   |   | \r\n" + //
                        " |   |     | __ ) _   _ _ __| |__   __ _ _ __   | ____|_  ___ __  _ __ ___  ___ ___      |   | \r\n" + //
                        " |   |     |  _ \\| | | | '__| '_ \\ / _` | '_ \\  |  _| \\ \\/ / '_ \\| '__/ _ \\/ __/ __|     |   | \r\n" + //
                        " |   |     | |_) | |_| | |  | | | | (_| | | | | | |___ >  <| |_) | | |  __/\\__ \\__ \\     |   | \r\n" + //
                        " |   |     |____/ \\__,_|_|  |_| |_|\\__,_|_| |_| |_____/_/\\_\\ .__/|_|  \\___||___/___/     |   | \r\n" + //
                        " |   |                                                     |_|                           |   | \r\n" + //
                        " |___|                                                                                   |___| \r\n" + //
                        "(_____)---------------------------------------------------------------------------------(_____)");

    System.out.print("\nMasukkan nama kamu: ");
    String nama = input.nextLine();
    System.out.println("Hallo, " + nama +"! Selamat datang di Burhan Ekspress!");
    //Subtask2
        boolean checkStatus = true;

        while(checkStatus){
            System.out.print("\nMasukkan status paket (Shipped, In Transit, Delivered): ");
            String status = input.nextLine();
            
            if (status.equals("Shipped")){
                System.out.println("Paket telah dikirim dan sedang dalam perjalanan.");
            } else if (status.equals("In Transit")){
                System.out.println("Paket Sedang dalam perjalanan");
            } else if (status.equals("Delivered")){
                System.out.println("Paket telah dampai di tujuan");
            } else {
                System.out.println("Status paket tidak valid");
            }

            boolean invalidInput = false;

            System.out.print("Apakah ingin cek status paket lain? (yes/no): ");
            String checkOther = input.nextLine();
            
            if (checkOther.equals("yes")){
                checkStatus = true;
            } else if (checkOther.equals("no")){
                checkStatus = false;
            } else {
                invalidInput = true;

                while (invalidInput){
                    System.out.print("Input tidak valid. Silahkan masukkan 'yes' atau 'no':");
                    String checkInput = input.nextLine();

                    if (checkInput.equals("yes") || checkInput.equals("no")){
                        invalidInput = false;
                    }
                }
            }
        }
    }
}
