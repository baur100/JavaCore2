package hWA11;

public class SysBlock {
    private Prosessor prosessor;
    private MotherBoard motherBoard;
    private Gpu gpu;
    private Memory memory;
    private Cpu_cooler cpuCooler;
    private Hdd hdd;
    private PowerSupply powerSupply;

    public SysBlock(Prosessor prosessor, MotherBoard motherBoard, Gpu gpu, Memory memory, Cpu_cooler cpuCooler, Hdd hdd, PowerSupply powerSupply) {
        this.prosessor = prosessor;
        this.motherBoard = motherBoard;
        this.gpu = gpu;
        this.memory = memory;
        this.cpuCooler = cpuCooler;
        this.hdd = hdd;
        this.powerSupply = powerSupply;
    }

    public Prosessor getProsessor() {
        return prosessor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public Cpu_cooler getCpuCooler() {
        return cpuCooler;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }
    public void printInfo(){
        prosessor.printInfo();
        motherBoard.printInfo();
        gpu.printInfo();
        memory.printInfo();
        cpuCooler.printInfo();
        hdd.printInfo();
        powerSupply.printInfo();

    }
}
