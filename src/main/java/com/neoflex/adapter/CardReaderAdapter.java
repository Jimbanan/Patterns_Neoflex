package com.neoflex.adapter;

public class CardReaderAdapter implements USB{

    private MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }


    @Override
    public void connectUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
        this.memoryCard.extract();
    }
}
