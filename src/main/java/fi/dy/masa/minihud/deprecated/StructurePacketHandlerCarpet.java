package fi.dy.masa.minihud.deprecated;

//import net.minecraft.nbt.NbtCompound;
//import net.minecraft.nbt.NbtList;
//import net.minecraft.network.PacketByteBuf;
//import net.minecraft.util.Identifier;

//import fi.dy.masa.malilib.network.IPluginChannelHandler;
//import fi.dy.masa.malilib.util.Constants;
//import fi.dy.masa.minihud.MiniHUD;
//import fi.dy.masa.minihud.data.DataStorage;

/**
 * I wasn't able to find this Channel under the Carpet code.  --> Disabled.
 * If I am wrong, I'll put it back and re-implement it.
 */
@Deprecated(forRemoval = false)
//public class StructurePacketHandlerCarpet implements IPluginChannelHandler
public class StructurePacketHandlerCarpet
{
    // Change Channel Identifier to having two parameters
    // --> I can't find this code under carpet mod -- Was it removed?
    /*
    public static final Identifier CHANNEL = new Identifier("carpet", "structures");
    public static final int PACKET_S2C_DATA = 0;
    public static final int VERSION = 1;

    public static final StructurePacketHandlerCarpet INSTANCE = new StructurePacketHandlerCarpet();

    private boolean registered;
    private int timeout;

    public void reset()
    {
        this.registered = false;
    }

    //@Override
    public Identifier getChannel()
    {
        return CHANNEL;
    }

    //@Override
    public void onPacketReceived(PacketByteBuf buf)
    {
        int id = buf.readVarInt();

        MiniHUD.printDebug("StructurePacketHandlerCarpet#onPacketReceived(): " + id);

        if (id == PACKET_S2C_DATA)
        {
            NbtCompound tag = buf.readNbt();

            if (tag != null)
            {
                // Normal structure data packet
                if (this.registered && tag.contains("Structures", Constants.NBT.TAG_LIST))
                {
                    NbtList structures = tag.getList("Structures", Constants.NBT.TAG_COMPOUND);
                    DataStorage.getInstance().addOrUpdateStructuresFromServer(structures, this.timeout, false);
                }
                // Metadata packet upon channel registration
                else if (tag.contains("Version", Constants.NBT.TAG_INT) &&
                         tag.contains("Timeout", Constants.NBT.TAG_INT) &&
                         tag.getInt("Version") == VERSION)
                {
                    this.timeout = tag.getInt("Timeout");
                    this.registered = true;
                }
            }
        }
    }
     */
}