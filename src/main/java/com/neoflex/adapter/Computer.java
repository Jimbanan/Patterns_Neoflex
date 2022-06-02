package com.neoflex.adapter;

public class Computer {

    private final USB cardReader;

    public Computer() {
        cardReader = new CardReaderAdapter(new MemoryCard());
    }

    public void MemoryCardToUSB() {
        this.cardReader.connectUsbCable();
    }
}
