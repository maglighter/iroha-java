//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.expression

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.UInt

/**
 * Multiply
 *
 * Generated from 'iroha_data_model::expression::Multiply' regular structure
 */
public data class Multiply(
    public val left: EvaluatesTo<UInt>,
    public val right: EvaluatesTo<UInt>
) {
    public companion object : ScaleReader<Multiply>, ScaleWriter<Multiply> {
        public override fun read(reader: ScaleCodecReader): Multiply = Multiply(
            EvaluatesTo.read(reader) as EvaluatesTo<UInt>,
            EvaluatesTo.read(reader) as EvaluatesTo<UInt>,
        )

        public override fun write(writer: ScaleCodecWriter, instance: Multiply) {
            EvaluatesTo.write(writer, instance.left)
            EvaluatesTo.write(writer, instance.right)
        }
    }
}