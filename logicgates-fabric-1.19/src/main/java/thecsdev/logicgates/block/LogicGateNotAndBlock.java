package thecsdev.logicgates.block;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
/**
 * The NAND logic gate.
 */
public final class LogicGateNotAndBlock extends AbstractLogicSideGateBlock
{
	// ==================================================
	@Override
	public String getBlockIdPath() { return "nand_gate"; }
	// --------------------------------------------------
	@Override
	public boolean gateConditionsMet(BlockState thisBlockState, World world, BlockPos pos)
	{
		boolean left = getSideInputLevel(thisBlockState, world, pos) > 0;
		boolean front = getFrontInputLevel(thisBlockState, world, pos) > 0;
		return !(left && front);
	}
	// ==================================================
}
