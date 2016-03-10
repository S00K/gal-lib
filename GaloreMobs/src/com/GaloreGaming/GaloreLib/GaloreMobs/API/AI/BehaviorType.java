package com.GaloreGaming.GaloreLib.GaloreMobs.API.AI;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack;
import net.minecraft.server.v1_8_R3.PathfinderGoalAvoidTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalBeg;
import net.minecraft.server.v1_8_R3.PathfinderGoalBreakDoor;
import net.minecraft.server.v1_8_R3.PathfinderGoalBreed;
import net.minecraft.server.v1_8_R3.PathfinderGoalDefendVillage;
import net.minecraft.server.v1_8_R3.PathfinderGoalDoorInteract;
import net.minecraft.server.v1_8_R3.PathfinderGoalEatTile;
import net.minecraft.server.v1_8_R3.PathfinderGoalFleeSun;
import net.minecraft.server.v1_8_R3.PathfinderGoalFloat;
import net.minecraft.server.v1_8_R3.PathfinderGoalFollowOwner;
import net.minecraft.server.v1_8_R3.PathfinderGoalFollowParent;
import net.minecraft.server.v1_8_R3.PathfinderGoalHurtByTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalInteract;
import net.minecraft.server.v1_8_R3.PathfinderGoalInteractVillagers;
import net.minecraft.server.v1_8_R3.PathfinderGoalJumpOnBlock;
import net.minecraft.server.v1_8_R3.PathfinderGoalLeapAtTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalLookAtPlayer;
import net.minecraft.server.v1_8_R3.PathfinderGoalLookAtTradingPlayer;
import net.minecraft.server.v1_8_R3.PathfinderGoalMakeLove;
import net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveIndoors;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveThroughVillage;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsRestriction;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalNearestAttackableTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalNearestAttackableTargetInsentient;
import net.minecraft.server.v1_8_R3.PathfinderGoalOcelotAttack;
import net.minecraft.server.v1_8_R3.PathfinderGoalOfferFlower;
import net.minecraft.server.v1_8_R3.PathfinderGoalOpenDoor;
import net.minecraft.server.v1_8_R3.PathfinderGoalOwnerHurtByTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalOwnerHurtTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalPanic;
import net.minecraft.server.v1_8_R3.PathfinderGoalPassengerCarrotStick;
import net.minecraft.server.v1_8_R3.PathfinderGoalPlay;
import net.minecraft.server.v1_8_R3.PathfinderGoalRandomLookaround;
import net.minecraft.server.v1_8_R3.PathfinderGoalRandomStroll;
import net.minecraft.server.v1_8_R3.PathfinderGoalRandomTargetNonTamed;
import net.minecraft.server.v1_8_R3.PathfinderGoalRestrictOpenDoor;
import net.minecraft.server.v1_8_R3.PathfinderGoalRestrictSun;
import net.minecraft.server.v1_8_R3.PathfinderGoalSit;
import net.minecraft.server.v1_8_R3.PathfinderGoalSwell;
import net.minecraft.server.v1_8_R3.PathfinderGoalTakeFlower;
import net.minecraft.server.v1_8_R3.PathfinderGoalTame;
import net.minecraft.server.v1_8_R3.PathfinderGoalTargetNearestPlayer;
import net.minecraft.server.v1_8_R3.PathfinderGoalTempt;
import net.minecraft.server.v1_8_R3.PathfinderGoalTradeWithPlayer;
import net.minecraft.server.v1_8_R3.PathfinderGoalVillagerFarm;

public enum BehaviorType {

	ATTACK_ARROW(PathfinderGoalArrowAttack.class),
	MOVE_AVOID(PathfinderGoalAvoidTarget.class),
	ACTION_BEG(PathfinderGoalBeg.class),
	ACTION_BREAKDOOR(PathfinderGoalBreakDoor.class),
	ACTION_BREED(PathfinderGoalBreed.class),
	ACTION_DEFENDVILLAGE(PathfinderGoalDefendVillage.class),
	ACTION_DOORINTERACT(PathfinderGoalDoorInteract.class),
	ACTION_EATTILE(PathfinderGoalEatTile.class),
	MOVE_FLEESUN(PathfinderGoalFleeSun.class),
	MOVE_FLOAT(PathfinderGoalFloat.class),
	MOVE_FOLLOWOWNER(PathfinderGoalFollowOwner.class),
	MOVE_FOLLOWPARENT(PathfinderGoalFollowParent.class),
	TARGET_HURTBY(PathfinderGoalHurtByTarget.class),
	ACTION_INTERACT(PathfinderGoalInteract.class),
	ACTION_INTERACTVILLAGERS(PathfinderGoalInteractVillagers.class),
	MOVE_JUMPONBLOCK(PathfinderGoalJumpOnBlock.class),
	ATTACK_LEAP(PathfinderGoalLeapAtTarget.class),
	ACTION_LOOKATENTITY(PathfinderGoalLookAtPlayer.class),
	ACTION_LOOKATTRADE(PathfinderGoalLookAtTradingPlayer.class),
	ACTION_MAKELOVE(PathfinderGoalMakeLove.class),
	ATTACK_MELEE(PathfinderGoalMeleeAttack.class),
	MOVE_INDOORS(PathfinderGoalMoveIndoors.class),
	MOVE_THROUGHVILLAGE(PathfinderGoalMoveThroughVillage.class),
	MOVE_TORESTRICTION(PathfinderGoalMoveTowardsRestriction.class),
	MOVE_TOTARGET(PathfinderGoalMoveTowardsTarget.class),
	TARGET_NEAREST(PathfinderGoalNearestAttackableTarget.class),
	TARGET_NEARESTINSENTIENT(PathfinderGoalNearestAttackableTargetInsentient.class),
	ATTACK_OCELOT(PathfinderGoalOcelotAttack.class),
	ACTION_OFFERFLOWER(PathfinderGoalOfferFlower.class),
	ACTION_OPENDOOR(PathfinderGoalOpenDoor.class),
	TARGET_OWNERATTACKER(PathfinderGoalOwnerHurtByTarget.class),
	TARGET_OWNERVICTIM(PathfinderGoalOwnerHurtTarget.class),
	MOVE_PANIC(PathfinderGoalPanic.class),
	MOVE_FOLLOWCARROT(PathfinderGoalPassengerCarrotStick.class),
	ACTION_PLAY(PathfinderGoalPlay.class),
	ACTION_RANDOMLOOK(PathfinderGoalRandomLookaround.class),
	MOVE_RANDOMSTROLL(PathfinderGoalRandomStroll.class),
	TARGET_NONTAMED(PathfinderGoalRandomTargetNonTamed.class),
	MOVE_RESTRICTOPENDOOR(PathfinderGoalRestrictOpenDoor.class),
	MOVE_RESTRICTSUN(PathfinderGoalRestrictSun.class),
	ACTION_SIT(PathfinderGoalSit.class),
	ACTION_SWELL(PathfinderGoalSwell.class),
	ACTION_TAKEFLOWER(PathfinderGoalTakeFlower.class),
	ACTION_TAME(PathfinderGoalTame.class),
	TARGET_NEARESTPLAYER(PathfinderGoalTargetNearestPlayer.class),
	ACTION_TEMPT(PathfinderGoalTempt.class),
	ACTION_TRADEWITHPLAYER(PathfinderGoalTradeWithPlayer.class),
	ACTION_VILLAGERFARM(PathfinderGoalVillagerFarm.class),
	NULL(null);
	
	private final Class<? extends PathfinderGoal> nmsPathfinderClass;
	
	private BehaviorType(Class<? extends PathfinderGoal> behaviorClass)
	{
		
		this.nmsPathfinderClass = behaviorClass;
		
	}
	
	private static final Map<Class<? extends PathfinderGoal>, BehaviorType> behaviorMap;
	
	static
	{
		
		behaviorMap = new HashMap<Class<? extends PathfinderGoal>, BehaviorType>();
		for(BehaviorType type : BehaviorType.values())
		{
			
			if(type != BehaviorType.NULL) behaviorMap.put(type.nmsPathfinderClass, type);
			
		}
		
	}
	
	public static BehaviorType getBehavior(PathfinderGoal goal)
	{
		
		if(behaviorMap.containsKey(goal.getClass()))
		{
			
			return behaviorMap.get(goal.getClass());
			
		} else
		{
			
			return BehaviorType.NULL;
			
		}
		
	}
	
}
