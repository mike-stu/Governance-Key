package com.webank.keygen.hd.bip44;

import com.webank.keygen.hd.bip32.PathComponent;

/**
 * @author aaronchu
 * @Description
 * @data 2020/11/19
 */
public class Change {

    private PathComponent pathComponent;
    public Change(PathComponent previous, int idx){
        this.pathComponent = new PathComponent(previous, idx, false);
    }

    public AddressIndex addressIndex(int index){
        return new AddressIndex(this.pathComponent, index);
    }

}
