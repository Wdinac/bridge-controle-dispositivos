public class RemoteControl {
    protected Device device;
    
    public RemoteControl(Device device) {
        this.device = device;
    }
    
    public void togglePower() {
        if (device.isLigado()) {
            device.desligar();
        } else {
            device.ligar();
        }
    }
    
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }
    
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }
}