DESCRIPTION = "U-Boot based on mainline U-Boot used by DH electronics GmbH to support STM32MP1 DHSOMs"
LICENSE = "GPLv2+"
COMPATIBLE_MACHINE = "(dh-stm32mp1-dhcom-pdk2|dh-stm32mp1-dhcor-avenger96)"
DEPENDS += "flex-native bison-native"

PROVIDES += "u-boot"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"


