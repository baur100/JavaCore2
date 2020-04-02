package hw11;

public class Sysblock {
    private CPU cpu;
    private Motherboard mb;
    private RAM ram;
    private NetworkAdapter eth;
    private Soundcard audio;
    private Videocard video;

    public Sysblock(CPU cpu, Motherboard mb, RAM ram, NetworkAdapter eth, Soundcard audio, Videocard video) {
        this.cpu = cpu;
        this.mb = mb;
        this.ram = ram;
        this.eth = eth;
        this.audio = audio;
        this.video = video;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setMb(Motherboard mb) {
        this.mb = mb;
    }

    public Motherboard getMb() {
        return mb;
    }

    public void setEth(NetworkAdapter eth) {
        this.eth = eth;
    }

    public NetworkAdapter getEth() {
        return eth;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public RAM getRam() {
        return ram;
    }

    public void setAudio(Soundcard audio) {
        this.audio = audio;
    }

    public Soundcard getAudio() {
        return audio;
    }

    public void setVideo(Videocard video) {
        this.video = video;
    }

    public Videocard getVideo() {
        return video;
    }

    public void printInfo() {
        cpu.printInfo();
        mb.printInfo();
        ram.printInfo();
        eth.printInfo();
        audio.printInfo();
        video.printInfo();
    }
}
