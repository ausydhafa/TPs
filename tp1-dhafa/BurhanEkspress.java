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
    System.out.println("Hallo, " + nama +"! Selamat datang di Burhan Ekspress!\n");
    
    //Subtask3
        int jumlahShipped = 0;
        int jumlahTransit = 0;
        int jumlahDelivered = 0;

        System.out.print("Berapa jumlah paket yang ingin dicek statusnya? ");
            int jumlahPaket = Integer.parseInt(input.nextLine());

        for (int i = 1; i < jumlahPaket + 1; i++){
            System.out.print("Masukkan status paket " + i + " (Shipped, In Transit, Delivered): ");
            String status = input.nextLine();

            if (status.equals("Shipped")){
                System.out.println("Paket " + i + " telah dikirim dan sedang dalam perjalanan.\n");
                jumlahShipped++;
            } else if (status.equals("In Transit")){
                System.out.println("Paket " + i + " sedang dalam perjalanan.\n");
                jumlahTransit++;
            } else if (status.equals("Delivered")){
                System.out.println("Paket "+ i +" telah sampai di tujuan.\n");
                jumlahDelivered++;
            } else {
                i--;
                System.out.println("Status paket tidak valid!\n");
            }
        }
        System.out.println("\n===== RINGKASAN STATUS PAKET =====");
        System.out.println("Jumlah paket dengan status Shipped: " + jumlahShipped);
        System.out.println("Jumlah paket dengan status In Transit: " + jumlahTransit);
        System.out.println("Jumlah paket dengan status Delivered: " + jumlahDelivered);
        System.out.println("Total paket yang dicek: " + jumlahPaket);
        
        System.out.println("\nTerima kasih telah menggunakan layanan Burhan Ekspress!");
    }
}

