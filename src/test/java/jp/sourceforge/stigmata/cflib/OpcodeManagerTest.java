package jp.sourceforge.stigmata.cflib;

/*
 * $Id$
 */

import jp.sourceforge.stigmata.cflib.Opcode;
import jp.sourceforge.stigmata.cflib.OpcodeManager;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Haruaki Tamada
 * @version $Revision$
 */
public class OpcodeManagerTest{
    @Test
    public void testBasic(){
        Assert.assertNotNull(OpcodeManager.getInstance());

        Opcode opcode = OpcodeManager.getInstance().getOpcode(182);

        Assert.assertEquals(182, opcode.getOpcode());
        Assert.assertEquals("invokevirtual", opcode.getName());
    }
}
