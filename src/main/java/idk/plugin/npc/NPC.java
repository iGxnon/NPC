package idk.plugin.npc;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.EntityHuman;
import cn.nukkit.inventory.PlayerInventory;
import cn.nukkit.nbt.tag.*;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import idk.plugin.npc.entities.*;
import xyz.lightsky.ModelManage.ModelManage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NPC extends PluginBase {

    public static final List<String> entities = Arrays.asList("Bat", "Blaze", "Cat", "CaveSpider", "Chicken", "Cow", "Creeper",
            "Dolphin", "Donkey", "ElderGuardian", "Enderman", "Endermite", "Evoker", "Ghast", "Guardian",
            "Horse", "Human", "Husk", "IronGolem", "Lama", "Mooshroom", "MagmaCube", "Mule", "Ocelot", "Panda", "Parrot", "Phantom",
            "Pig", "Pillager", "PolarBear", "Rabbit", "SkeletonHorse", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime",
            "Snowman", "Spider", "Squid", "Stray", "Turtle", "Vex", "Villager", "Vindicator", "WanderingTrader", "Witch", "Wither",
            "WitherSkeleton", "Wolf", "ZombieHorse", "Zombie", "ZombiePigman", "ZombieVillager");

    static List<String> id = new ArrayList<>();
    static List<String> kill = new ArrayList<>();

    @Override
    public void onEnable() {
        registerNPC();
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    private void registerNPC() {
        Entity.registerEntity(NPC_Bat.class.getSimpleName(), NPC_Bat.class);
        Entity.registerEntity(NPC_Chicken.class.getSimpleName(), NPC_Chicken.class);
        Entity.registerEntity(NPC_Cow.class.getSimpleName(), NPC_Cow.class);
        Entity.registerEntity(NPC_Donkey.class.getSimpleName(), NPC_Donkey.class);
        Entity.registerEntity(NPC_Horse.class.getSimpleName(), NPC_Horse.class);
        Entity.registerEntity(NPC_Mooshroom.class.getSimpleName(), NPC_Mooshroom.class);
        Entity.registerEntity(NPC_Mule.class.getSimpleName(), NPC_Mule.class);
        Entity.registerEntity(NPC_Ocelot.class.getSimpleName(), NPC_Ocelot.class);
        Entity.registerEntity(NPC_Pig.class.getSimpleName(), NPC_Pig.class);
        Entity.registerEntity(NPC_PolarBear.class.getSimpleName(), NPC_PolarBear.class);
        Entity.registerEntity(NPC_Rabbit.class.getSimpleName(), NPC_Rabbit.class);
        Entity.registerEntity(NPC_Sheep.class.getSimpleName(), NPC_Sheep.class);
        Entity.registerEntity(NPC_SkeletonHorse.class.getSimpleName(), NPC_SkeletonHorse.class);
        Entity.registerEntity(NPC_Villager.class.getSimpleName(), NPC_Villager.class);
        Entity.registerEntity(NPC_Wolf.class.getSimpleName(), NPC_Wolf.class);
        Entity.registerEntity(NPC_ZombieHorse.class.getSimpleName(), NPC_ZombieHorse.class);
        Entity.registerEntity(NPC_ElderGuardian.class.getSimpleName(), NPC_ElderGuardian.class);
        Entity.registerEntity(NPC_Guardian.class.getSimpleName(), NPC_Guardian.class);
        Entity.registerEntity(NPC_Snowman.class.getSimpleName(), NPC_Snowman.class);
        Entity.registerEntity(NPC_Lama.class.getSimpleName(), NPC_Lama.class);
        Entity.registerEntity(NPC_Squid.class.getSimpleName(), NPC_Squid.class);
        Entity.registerEntity(NPC_Vindicator.class.getSimpleName(), NPC_Vindicator.class);
        Entity.registerEntity(NPC_Vex.class.getSimpleName(), NPC_Vex.class);
        Entity.registerEntity(NPC_IronGolem.class.getSimpleName(), NPC_IronGolem.class);
        Entity.registerEntity(NPC_Blaze.class.getSimpleName(), NPC_Blaze.class);
        Entity.registerEntity(NPC_Wither.class.getSimpleName(), NPC_Wither.class);
        Entity.registerEntity(NPC_Ghast.class.getSimpleName(), NPC_Ghast.class);
        Entity.registerEntity(NPC_CaveSpider.class.getSimpleName(), NPC_CaveSpider.class);
        Entity.registerEntity(NPC_Creeper.class.getSimpleName(), NPC_Creeper.class);
        Entity.registerEntity(NPC_Enderman.class.getSimpleName(), NPC_Enderman.class);
        Entity.registerEntity(NPC_Endermite.class.getSimpleName(), NPC_Endermite.class);
        Entity.registerEntity(NPC_ZombiePigman.class.getSimpleName(), NPC_ZombiePigman.class);
        Entity.registerEntity(NPC_Silverfish.class.getSimpleName(), NPC_Silverfish.class);
        Entity.registerEntity(NPC_Skeleton.class.getSimpleName(), NPC_Skeleton.class);
        Entity.registerEntity(NPC_Spider.class.getSimpleName(), NPC_Spider.class);
        Entity.registerEntity(NPC_Stray.class.getSimpleName(), NPC_Stray.class);
        Entity.registerEntity(NPC_Witch.class.getSimpleName(), NPC_Witch.class);
        Entity.registerEntity(NPC_Husk.class.getSimpleName(), NPC_Husk.class);
        Entity.registerEntity(NPC_Zombie.class.getSimpleName(), NPC_Zombie.class);
        Entity.registerEntity(NPC_ZombieVillager.class.getSimpleName(), NPC_ZombieVillager.class);
        Entity.registerEntity(NPC_Evoker.class.getSimpleName(), NPC_Evoker.class);
        Entity.registerEntity(NPC_Shulker.class.getSimpleName(), NPC_Shulker.class);
        Entity.registerEntity(NPC_Slime.class.getSimpleName(), NPC_Slime.class);
        Entity.registerEntity(NPC_WitherSkeleton.class.getSimpleName(), NPC_WitherSkeleton.class);
        Entity.registerEntity(NPC_MagmaCube.class.getSimpleName(), NPC_MagmaCube.class);
        Entity.registerEntity(NPC_Human.class.getSimpleName(), NPC_Human.class);
        Entity.registerEntity(NPC_Parrot.class.getSimpleName(), NPC_Parrot.class);
        Entity.registerEntity(NPC_Dolphin.class.getSimpleName(), NPC_Dolphin.class);
        Entity.registerEntity(NPC_Turtle.class.getSimpleName(), NPC_Turtle.class);
        Entity.registerEntity(NPC_Phantom.class.getSimpleName(), NPC_Phantom.class);
        Entity.registerEntity(NPC_Drowned.class.getSimpleName(), NPC_Drowned.class);
        Entity.registerEntity(NPC_Cat.class.getSimpleName(), NPC_Cat.class);
        Entity.registerEntity(NPC_Panda.class.getSimpleName(), NPC_Panda.class);
        Entity.registerEntity(NPC_Pillager.class.getSimpleName(), NPC_Pillager.class);
        Entity.registerEntity(NPC_WanderingTrader.class.getSimpleName(), NPC_WanderingTrader.class);
    }

    public CompoundTag nbt(Player p, String[] args, String name) {
        CompoundTag nbt = new CompoundTag()
                .putList(new ListTag<>("Pos")
                        .add(new DoubleTag("", p.x))
                        .add(new DoubleTag("", p.y))
                        .add(new DoubleTag("", p.z)))
                .putList(new ListTag<DoubleTag>("Motion")
                        .add(new DoubleTag("", 0))
                        .add(new DoubleTag("", 0))
                        .add(new DoubleTag("", 0)))
                .putList(new ListTag<FloatTag>("Rotation")
                        .add(new FloatTag("", (float) p.getYaw()))
                        .add(new FloatTag("", (float) p.getPitch())))
                .putBoolean("Invulnerable", true)
                .putString("NameTag", name)
                .putList(new ListTag<StringTag>("Commands"))
                .putList(new ListTag<StringTag>("PlayerCommands"))
                .putBoolean("npc", true)
                .putFloat("scale", 1);
        if ("Human".equals(args[1])) {
            CompoundTag skinTag = new CompoundTag()
                    .putByteArray("Data", p.getSkin().getSkinData().data)
                    .putInt("SkinImageWidth", p.getSkin().getSkinData().width)
                    .putInt("SkinImageHeight", p.getSkin().getSkinData().height)
                    .putString("ModelId", p.getSkin().getSkinId())
                    .putString("CapeId", p.getSkin().getCapeId())
                    .putByteArray("CapeData", p.getSkin().getCapeData().data)
                    .putInt("CapeImageWidth", p.getSkin().getCapeData().width)
                    .putInt("CapeImageHeight", p.getSkin().getCapeData().height)
                    .putByteArray("SkinResourcePatch", p.getSkin().getSkinResourcePatch().getBytes(StandardCharsets.UTF_8))
                    .putByteArray("GeometryData", p.getSkin().getGeometryData().getBytes(StandardCharsets.UTF_8))
                    .putByteArray("AnimationData", p.getSkin().getAnimationData().getBytes(StandardCharsets.UTF_8))
                    .putBoolean("PremiumSkin", p.getSkin().isPremium())
                    .putBoolean("PersonaSkin", p.getSkin().isPersona())
                    .putBoolean("CapeOnClassicSkin", p.getSkin().isCapeOnClassic());
            nbt.putCompound("Skin", skinTag);
            nbt.putBoolean("ishuman", true);
            nbt.putString("Item", p.getInventory().getItemInHand().getName());
            nbt.putString("Helmet", p.getInventory().getHelmet().getName());
            nbt.putString("Chestplate", p.getInventory().getChestplate().getName());
            nbt.putString("Leggings", p.getInventory().getLeggings().getName());
            nbt.putString("Boots", p.getInventory().getBoots().getName());
        }
        return nbt;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§c只能在游戏里使用该命令");
            return true;
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("npc")) {
            if (args.length < 1) {
                sendHelp(sender);
                return true;
            }
            switch (args[0].toLowerCase()) {
                case "spawn":
                    if (args.length < 2) {
                        sender.sendMessage("§c使用方法: /npc spawn <NPC种类> [名称]");
                        return true;
                    }

                    if (!entities.contains(args[1])) {
                        sender.sendMessage("§c没要找到NPC §4" + args[1] + "§c . 你可以使用指令§e/npc list§c 查看所有的NPC种类. 注意大小写哦.");
                        return true;
                    }
                    String name;
                    if (args.length < 2) {
                        name = "%k";
                    } else {
                        name = String.join(" ", args);
                        name = name.replaceFirst("spawn", "");
                        name = name.replaceFirst(args[1], "");
                        name = name.replaceFirst(" ", "");
                        name = name.replaceFirst(" ", "");
                    }
                    name = name.replaceAll("%n", "\n");
                    CompoundTag nbt = this.nbt(player, args, name);
                    Entity ent = Entity.createEntity("NPC_" + args[1], player.chunk, nbt);
                    ent.setNameTag(name);
                    if (!"%k".equals(name)) {
                        ent.setNameTagVisible(true);
                        ent.setNameTagAlwaysVisible(true);
                    }
                    ent.spawnToAll();
                    sender.sendMessage("§aNPC创建成功，它的id: §e" + ent.getId() + " §a,它的名字： §e" + ent.getName());
                    return true;
                case "getid":
                case "id":
                    id.add(player.getName());
                    player.sendMessage("§a请点击一个NPC来查看它的id");
                    return true;
                case "addcmd":
                    if (args.length < 3) {
                        sender.sendMessage("§c使用方法(添加控制台命令): /npc addcmd <NPC的id> <命令>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        player.sendMessage("§c使用方法(添加控制台命令): /npc addcmd <NPC的id> <命令>");
                        return true;
                    }
                    Entity enti = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (enti instanceof NPC_Human || enti instanceof NPC_Entity || enti.namedTag.getBoolean("npc")) {
                        String cmd;
                        cmd = String.join(" ", args);
                        cmd = cmd.replaceFirst("addcmd", "");
                        cmd = cmd.replaceFirst(args[1], "");
                        StringTag st = new StringTag(cmd, cmd);
                        if (enti.namedTag.getList("Commands", StringTag.class).getAll().contains(st)) {
                            player.sendMessage("§c该命令已经添加过了");
                            return true;
                        }
                        enti.namedTag.getList("Commands", StringTag.class).add(st);
                        player.sendMessage("§a成功添加该命令");
                        return true;
                    } else {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                case "addplayercmd":
                    if (args.length < 3) {
                        sender.sendMessage("§c使用方法(添加玩家命令): /npc addplayercmd <NPC的id> <命令>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        player.sendMessage("§c(添加玩家命令): /npc addplayercmd <NPC的id> <命令>");
                        return true;
                    }
                    Entity enti2 = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (enti2 instanceof NPC_Human || enti2 instanceof NPC_Entity || enti2.namedTag.getBoolean("npc")) {
                        String cmd;
                        cmd = String.join(" ", args);
                        cmd = cmd.replaceFirst("addplayercmd", "");
                        cmd = cmd.replaceFirst(args[1], "");
                        StringTag st = new StringTag(cmd, cmd);
                        if (enti2.namedTag.getList("PlayerCommands", StringTag.class).getAll().contains(st)) {
                            player.sendMessage("§c该命令已经添加过了");
                            return true;
                        }
                        enti2.namedTag.getList("PlayerCommands", StringTag.class).add(st);
                        player.sendMessage("§a成功添加该命令");
                        return true;
                    } else {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                case "listcmd":
                    if (args.length < 2) {
                        sender.sendMessage("§c使用方法: /npc listcmd <NPC的id>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        sender.sendMessage("§c使用方法: /npc listcmdd <NPC的id>");
                        return true;
                    }
                    Entity entity = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (entity instanceof NPC_Entity || entity instanceof NPC_Human || entity.namedTag.getBoolean("npc")) {
                        List<StringTag> cmddd = entity.namedTag.getList("Commands", StringTag.class).getAll();
                        player.sendMessage("§aNPC：" + entity.getName() + " ( id为：" + entity.getId() + ")§a的控制台命令有:");
                        for (StringTag cmdd : cmddd) {
                            player.sendMessage(cmdd.data);
                        }
                        List<StringTag> cmdddd = entity.namedTag.getList("PlayerCommands", StringTag.class).getAll();
                        player.sendMessage("§aNPC： " + entity.getName() + " ( id为：" + entity.getId() + ")§a的玩家命令有:");
                        for (StringTag cmdd : cmdddd) {
                            player.sendMessage(cmdd.data);
                        }
                        return true;
                    } else {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                case "delcmd":
                    if (args.length < 3) {
                        sender.sendMessage("§c使用方法: /npc delcmd <NPC的id> <指令>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        player.sendMessage("§c使用方法: /npc delcmd <NPC的id> <指令>");
                        return true;
                    }
                    Entity en = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (en instanceof NPC_Human || en instanceof NPC_Entity || en.namedTag.getBoolean("npc")) {
                        String cmd;
                        cmd = String.join(" ", args);
                        cmd = cmd.replaceFirst("delcmd", "");
                        cmd = cmd.replaceFirst(args[1], "");
                        StringTag st = new StringTag(cmd, cmd);
                        if (en.namedTag.getList("Commands", StringTag.class).getAll().contains(st)) {
                            en.namedTag.getList("Commands", StringTag.class).remove(st);
                            player.sendMessage("§a控制台指令: §e" + cmd + "§a 成功被移除");
                            return true;
                        } else {
                            player.sendMessage("§c控制台指令: §e" + cmd + "§c 没有发现");
                            return true;
                        }
                    } else {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                case "delplayercmd":
                    if (args.length < 3) {
                        sender.sendMessage("§c使用方法: /npc delplayercmd <NPC的id> <命令>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        player.sendMessage("§c使用方法: /npc delplayercmd <NPC的id> <命令>");
                        return true;
                    }
                    Entity en2 = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (en2 instanceof NPC_Human || en2 instanceof NPC_Entity || en2.namedTag.getBoolean("npc")) {
                        String cmd;
                        cmd = String.join(" ", args);
                        cmd = cmd.replaceFirst("delplayercmd", "");
                        cmd = cmd.replaceFirst(args[1], "");
                        StringTag st = new StringTag(cmd, cmd);
                        if (en2.namedTag.getList("PlayerCommands", StringTag.class).getAll().contains(st)) {
                            en2.namedTag.getList("PlayerCommands", StringTag.class).remove(st);
                            player.sendMessage("§a玩家命令: " + cmd + "§a 成功被移除");
                            return true;
                        } else {
                            player.sendMessage("§c玩家命令: " + cmd + "§c 没有发现");
                            return true;
                        }
                    } else {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                case "delallcmd":
                    if (args.length < 2) {
                        sender.sendMessage("§c使用方法: /npc delallcmd <NPC的id>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        player.sendMessage("§c使用方法: /npc delallcmd <NPC的id>");
                        return true;
                    }
                    Entity en3 = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (en3 instanceof NPC_Human || en3 instanceof NPC_Entity || en3.namedTag.getBoolean("npc")) {
                        en3.namedTag.putList(new ListTag<StringTag>("Commands")).putList(new ListTag<StringTag>("PlayerCommands"));
                        sender.sendMessage("§a指令已经全部移除");
                    } else {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                case "edit":
                    if (args.length < 3) {
                        player.sendMessage("§c使用方法: /npc edit <ID> <item|armor|scale|name|tphere>");
                        return true;
                    }
                    if (!isInteger(args[1])) {
                        sender.sendMessage("§c使用方法: /npc edit <ID> <item|armor|scale|name|tphere>");
                        return true;
                    }
                    Entity e = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if (e == null) {
                        player.sendMessage("§c没有发现该id的NPC");
                        return true;
                    }
                    PlayerInventory pl = player.getInventory();
                    switch (args[2].toLowerCase()) {
                        case "handitem":
                        case "item":
                        case "hand":
                            if (e instanceof NPC_Human || e.namedTag.getBoolean("ishuman")) {
                                NPC_Human nh = (NPC_Human) e;
                                nh.getInventory().setItemInHand(pl.getItemInHand());
                                player.sendMessage("§aNPC的手持物改变为： §e" + pl.getItemInHand().getName());
                                nh.namedTag.putString("Item", pl.getItemInHand().getName());
                                return true;
                            } else {
                                player.sendMessage("§c那个实体无法手持物品哦");
                                return true;
                            }
                        case "armor":
                            if (e instanceof NPC_Human || e.namedTag.getBoolean("ishuman")) {
                                NPC_Human nh = (NPC_Human) e;
                                nh.getInventory().setHelmet(pl.getHelmet());
                                player.sendMessage("§aNPC的头盔改变为 §e" + pl.getHelmet().getName());
                                nh.namedTag.putString("Helmet", pl.getHelmet().getName());
                                nh.getInventory().setChestplate(pl.getChestplate());
                                player.sendMessage("§aNPC的胸甲改变为 §e" + pl.getChestplate().getName());
                                nh.namedTag.putString("Chestplate", pl.getChestplate().getName());
                                nh.getInventory().setLeggings(pl.getLeggings());
                                player.sendMessage("§aNPC的护腿改变为 §e" + pl.getLeggings().getName());
                                nh.namedTag.putString("Leggings", pl.getLeggings().getName());
                                nh.getInventory().setBoots(pl.getBoots());
                                player.sendMessage("§aNPC的靴子改变为 §e" + pl.getBoots().getName());
                                nh.namedTag.putString("Boots", pl.getBoots().getName());
                                return true;
                            } else {
                                player.sendMessage("§c那个实体无法手持物品哦");
                                return true;
                            }
                        case "scale":
                        case "size":
                            if (args.length < 4) {
                                player.sendMessage("§c使用方法: /npc edit <NPC的id> scale <int> §e默认是 1.");
                                return true;
                            }
                            if (!isFloat(args[3])) {
                                player.sendMessage("§c使用方法: /npc edit <NPC的id> scale <int> §e默认是 1.");
                                return true;
                            }
                            if (Float.parseFloat(args[3]) > 25) {
                                player.sendMessage("§c最大尺寸是 25");
                                return true;
                            }
                            if (e instanceof NPC_Human || e instanceof NPC_Entity || e.namedTag.getBoolean("npc")) {
                                e.setScale(Float.parseFloat(args[3]));
                                e.namedTag.putFloat("scale", Float.parseFloat(args[3]));
                                player.sendMessage("§a成功吧大小改成 §e" + args[3]);
                                return true;
                            } else {
                                player.sendMessage("§c没有发现该id的NPC");
                                return true;
                            }
                        case "name":
                            if (args.length < 3) {
                                player.sendMessage("§c使用方法: /npc edit <NPC的id> 名字 <原来的名字>");
                                return true;
                            }
                            if (e instanceof NPC_Human || e instanceof NPC_Entity || e.namedTag.getBoolean("npc")) {
                                if (args.length != 3) {
                                    name = String.join(" ", args);
                                    name = name.replaceFirst("edit", "");
                                    name = name.replaceFirst("name", "");
                                    name = name.replaceFirst(args[1], "");
                                    name = name.replaceFirst(" ", "");
                                    name = name.replaceFirst(" ", "");
                                    name = name.replaceFirst(" ", "");
                                } else {
                                    name = "%k";
                                    e.setNameTagVisible(false);
                                    e.setNameTagAlwaysVisible(false);
                                    player.sendMessage("§aName removed");
                                }
                                name = name.replaceAll("%n", "\n");
                                if (!name.equals("%k")) {
                                    e.setNameTag(name);
                                    e.setNameTagVisible();
                                    player.sendMessage("§a名字改变为 §e" + name);
                                }
                                e.namedTag.putString("NameTag", name);
                                return true;
                            } else {
                                player.sendMessage("§c没有发现该id的NPC");
                                return true;
                            }
                        case "gohere":
                        case "tphere":
                        case "tp":
                        case "teleport":
                            if (args.length < 2) {
                                player.sendMessage("§cUsage: /npc edit <NPC的id> tphere");
                                return true;
                            }
                            if (e instanceof NPC_Human || e instanceof NPC_Entity || e.namedTag.getBoolean("npc")) {
                                e.teleport(player);
                                e.respawnToAll();
                                player.sendMessage("§aNPC已经传送到你那了");
                                return true;
                            }
                    }
                case "remove":
                case "kill":
                    if (kill.contains(player.getName())) {
                        kill.remove(player.getName());
                        player.sendMessage("§c你已经输入过了该命令");
                    } else {
                        kill.add(player.getName());
                        player.sendMessage("§a请点击一个NPC来移除它");
                    }
                    return true;
                case "entities":
                case "list":
                    sender.sendMessage("§aNPC种类列表: §3" + entities.toString());
                    return true;
                case "model":
                    Plugin model = null;
                    if((model = Server.getInstance().getPluginManager().getPlugin("ModelManage")) == null) return false;
                    if(args.length != 3){
                        sender.sendMessage("§3设置NPC皮肤模型: §e/npc model <ID> <模型名称>");
                    }
                    Entity entity1 = player.getLevel().getEntity(Integer.parseInt(args[1]));
                    if(!(entity1 instanceof NPC_Human)) {
                        sender.sendMessage("这个NPC无法修改模型");
                    }else if(!ModelManage.getHuman_Model().containsKey(args[2])){
                        sender.sendMessage("没有这个名字的玩家模型文件");
                    }else {
                        ModelManage.setSkin((EntityHuman) entity1, ModelManage.getHuman_Model().get(args[2]));
                    }
                    return true;
                default:
                    sendHelp(sender);
                    return true;
            }
        }

        return true;
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private static void sendHelp(CommandSender sender) {
        sender.sendMessage("§l§a--- 帮助 注：\"()\"里表示注解不是指令 ---");
        sender.sendMessage("§3创建 NPC: §e/npc spawn <entity> <name>");
        sender.sendMessage("§3添加控制台命令: §e/npc addcmd <ID> <cmd>");
        sender.sendMessage("§3添加玩家命令: §e/npc addplayercmd <ID> <cmd>");
        sender.sendMessage("§3删除控制台命令: §e/npc delcmd <ID> <cmd>");
        sender.sendMessage("§3删除玩家命令: §e/npc delplayercmd <ID> <cmd>");
        sender.sendMessage("§3删除npc所有命令: §e/npc delallcmd <ID>");
        sender.sendMessage("§3查看npc所有命令: §e/npc listcmd <ID>");
        sender.sendMessage("§3编辑 NPC: §e/npc edit <ID> <item(手持)|armor(装备)|scale(大小)|name(名称)|tphere(传送到这)>");
        sender.sendMessage("§3获得NPC的 id: §e/npc getid");
        sender.sendMessage("§3NPC的种类列表: §e/npc entities");
        sender.sendMessage("§3移除NPC: §e/npc remove");
        sender.sendMessage("§3查看所有NPC种类: §e/npc list");

        Plugin model = null;
        if((model = Server.getInstance().getPluginManager().getPlugin("ModelManage")) != null){
            sender.sendMessage("§3设置NPC皮肤模型: §e/npc model <ID> <模型名称>");
        }

    }
}
