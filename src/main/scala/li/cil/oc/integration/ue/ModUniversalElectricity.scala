package li.cil.oc.integration.ue

import li.cil.oc.integration.ModProxy
import li.cil.oc.integration.Mods
import net.minecraftforge.common.MinecraftForge

object ModUniversalElectricity extends ModProxy {
  override def getMod = Mods.UniversalElectricity

  override def initialize() {
    MinecraftForge.EVENT_BUS.register(EventHandlerUniversalElectricity)
  }
}
