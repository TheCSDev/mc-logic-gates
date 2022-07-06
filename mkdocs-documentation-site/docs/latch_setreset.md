# SR latch
A latch whose output can be turned on and off using it's inputs.

## Obtaining
This block can be broken with any tool, as well as the fist.<br/>
It can be crafted using the following crafting recipe:<br/>
<br/>
![Crafting recipe](data:image/png;base64,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)
<br/>
<table>
	<tr><td>OR gate</td><td>AND gate</td><td>-</td></tr>
	<tr><td>-</td><td>NOT gate</td><td>-</td></tr>
	<tr><td>-</td><td>-</td><td>-</td></tr>
</table>

## Behavior
The SR latch has two inputs and one output.<br/>
The front input acts as SET. It makes the output turn on when powered.<br/>
The side input acts as RESET. It makes the output turn off when powered.

## Data values
### Block ID
`logicgates:sr_latch`

### Block states
| Blockstate  | Values                           | Description                          |
| :---------- | :------------------------------- | :----------------------------------- |
| `facing`    | `east`, `west`, `north`, `south` | The direction the block is facing.  |
| `powered`   | `true`, `false` | Whether the block is recieving redstone power. |
| `swapped_direction`   | `true`, `false` | Whether the block's side input direction is swapped. |