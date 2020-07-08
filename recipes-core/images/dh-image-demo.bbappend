

IMAGE_INSTALL_append_dh-stm32mp1-dhcom-common-pdk2 = " ${IMAGE_INSTALL_DH_STM32MP1} "
IMAGE_INSTALL_append_dh-stm32mp1-dhcor-common-avenger96 = " ${IMAGE_INSTALL_DH_STM32MP1} "

IMAGE_FEATURES_append_dh-stm32mp1-dhcom-common-pdk2 = " ${IMAGE_FEATURES_DH_STM32MP1} "
IMAGE_FEATURES_append_dh-stm32mp1-dhcor-common-avenger96 = " ${IMAGE_FEATURES_DH_STM32MP1} "

IMAGE_FSTYPES += " wic "
