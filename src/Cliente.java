public class Cliente {
    public static void main(String[] args) {
        Device tv = new TV(); // Cria a TV como um dispositivo
        // Controla a TV com um controle remoto comum
        // (mas poderia ser com avançado)
        RemoteControl remoteTV = new RemoteControl(tv);
        remoteTV.togglePower();
        remoteTV.volumeUp();
        
        System.out.println();
        
        Device radio = new Radio(); // Cria o radio como um dispositivo
        // Controla o rádio com um controle remoto avançado
        // (mas poderia ser um comum)
        AdvancedRemoteControl advancedRadio = new AdvancedRemoteControl(radio);
        advancedRadio.togglePower();
        advancedRadio.volumeUp();
        advancedRadio.mute();
    }
}
